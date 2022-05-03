//package com.kulit.flight;
//
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
//import org.springframework.data.cassandra.core.CassandraOperations;
//import org.springframework.data.cassandra.core.CassandraTemplate;
//import org.springframework.data.cassandra.core.convert.MappingCassandraConverter;
//import org.springframework.data.cassandra.core.mapping.BasicCassandraMappingContext;
//
//public class Application extends AbstractCassandraConfiguration {
//
//
//        private static final String KEYSPACE_NAME = "proj";
//        private static final String CONTACT_POINTS = "127.0. 0.0";
//        private static final int PORT = 9042;
//        private static final int MAX_POOL_CONNECTION = 50;
//
//        @Override
//        protected String getKeyspaceName() {
//
//            return KEYSPACE_NAME;
//        }
//
//        @Override
//        protected String getContactPoints() {
//            return CONTACT_POINTS;
//        }
//
//        @Override
//        protected int getPort() {
//            return PORT;
//        }
//
//
//        @Bean(name="proj")
//        public CassandraOperations operations() throws Exception {
//
//            return new CassandraTemplate(session().getObject(), new MappingCassandraConverter(new BasicCassandraMappingContext()));
//        }
//
//
//
//        public static void main(String[] args) {
//            SpringApplication.run(Application.class, args);
//
//        }
//
//
//    }
//}
