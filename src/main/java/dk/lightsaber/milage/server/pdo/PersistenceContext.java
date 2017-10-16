package dk.lightsaber.milage.server.pdo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages="dk.lightsaber.milage.server.pdo.repository")
@EnableTransactionManagement
public class PersistenceContext {
	@Bean
	DataSource getDataSource() {
		SimpleDriverDataSource bean = new SimpleDriverDataSource(
				new org.postgresql.Driver(), 
				"jdbc:postgresql://localhost:5432/milageDB", 
				"postgres", 
				"postgres");
				
		return bean;
	}
	
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
	    HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	    vendorAdapter.setDatabase(Database.POSTGRESQL);
	    vendorAdapter.setGenerateDdl(true);

	    LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
	    factory.setJpaVendorAdapter(vendorAdapter);
	    factory.setPackagesToScan(getClass().getPackage().getName());
	    factory.setDataSource(getDataSource());

	    return factory;
	  }

	  @Bean
	  @Autowired
	  public JpaTransactionManager transactionManager() {
	    JpaTransactionManager txManager = new JpaTransactionManager();
	    txManager.setEntityManagerFactory(entityManagerFactory().getObject());

	    return txManager;
	  }
	

}
