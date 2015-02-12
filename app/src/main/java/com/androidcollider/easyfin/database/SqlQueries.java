package com.androidcollider.easyfin.database;

/**
 * Created by pseverin on 22.12.14.
 */
public class SqlQueries {
    //make a string SQL request for Account table
    public static final String create_account_table = "CREATE TABLE Account (" +
            "id_accaunt       INTEGER PRIMARY KEY AUTOINCREMENT," +
            "date             INTEGER NOT NULL," +
            "name             TEXT NOT NULL," +
            "amount           INTEGER NOT NULL," +
            "currency         TEXT NOT NULL" +
            ");";
    //make a string SQL request for Transaction table
    public static final String create_transaction_table = "CREATE TABLE Transaction (" +
            "id_transaction   INTEGER PRIMARY KEY AUTOINCREMENT," +
            "date             INTEGER NOT NULL," +
            "id_account       INTEGER NOT NULL," +
            "amount           INTEGER NOT NULL," +
            "id_category      TEXT NOT NULL" +
            ");";
    //make a string SQL request for Category table
    public static final String create_category_table = "CREATE TABLE Comment (" +
            "id_category       INTEGER PRIMARY KEY NOT NULL," +
            "name              TEXT NOT NULL" +
            ");";
}
