package com.example.demo.service;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


import org.springframework.stereotype.Component;

import io.debezium.engine.ChangeEvent;
import io.debezium.engine.DebeziumEngine;
import io.debezium.engine.format.Json;


@Component
public class StudentConnector {

	public void studentconnector() throws IOException
	{
		final Properties props = new Properties();
		props.setProperty("name", "engine");
		props.setProperty("connector.class", "io.debezium.connector.postgresql.PostgresConnector");
		props.setProperty("database.hostname", "localhost");
		props.setProperty("database.port", "5432");
		props.setProperty("database.user", "postgres");
		props.setProperty("database.password", "password");
		props.setProperty("database.dbname", "test");
		DebeziumEngine<ChangeEvent<String, String>> engine = DebeziumEngine.create(Json.class)
		        .using(props)
		        .notifying(record -> {
		            System.out.println(record);
		        }).build();
		  ExecutorService executor = Executors.newSingleThreadExecutor();
		    executor.execute(engine);
}
}


