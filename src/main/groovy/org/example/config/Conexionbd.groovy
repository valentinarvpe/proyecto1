package org.example.config
import groovy.sql.Sql

@Singleton
class Conexionbd {

    private static Sql instanciaSQl

    static {
        def url = 'jdbc:mysql://localhost:3306/bdpruebas'
        def user = 'root'
        def password = 'Ami1'
        def driver = 'com.mysql.cj.jdbc.Driver'
        instanciaSQl = Sql.newInstance(url, user, password, driver)    }

    Sql getConnection() {
        return instanciaSQl
    }

    void closeConnection() {
        if (instanciaSQl != null) {
            instanciaSQl.close()
        }
    }
}