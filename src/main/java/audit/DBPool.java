package audit;


import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.sql.Connection;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DBPool {
	private static DBPool dbPool;
	private ComboPooledDataSource dataSource;
	static {
		dbPool = new DBPool();
	}
	
	public DBPool() {
		audit.ConInfo c = audit.ConInfo.ZHONGJIE;
		try {
			dataSource = new ComboPooledDataSource();
			dataSource.setUser(c.user);
			dataSource.setPassword(c.password);
			dataSource.setJdbcUrl(c.url);
			dataSource.setDriverClass(c.driver);
			dataSource.setInitialPoolSize(2);
			dataSource.setMinPoolSize(1);
			dataSource.setMaxPoolSize(10);
			dataSource.setMaxStatements(50);
			dataSource.setMaxIdleTime(60);
		} catch (PropertyVetoException e) {
			throw new RuntimeException(e);
		}
	}

	public final static DBPool getInstance() {
		return dbPool;
	}

	public final java.sql.Connection getConnection() {
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException("数据库连接失败", e);
		}
	}

	public ComboPooledDataSource getDataSource() {
		return dataSource;
	}
}
