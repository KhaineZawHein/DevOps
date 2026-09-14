package org.example;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Main {
    public static void main(String[] args) {
        // Connect to MongoDB container named mongo-dbserver
        MongoClient mongoClient = new MongoClient("mongo-dbserver");
        MongoDatabase database = mongoClient.getDatabase("mydb");
        MongoCollection<Document> collection = database.getCollection("test");

        Document doc = new Document("name", "Khaine Zaw Hein")
                .append("class", "DevOps")
                .append("year", "2026");
        collection.insertOne(doc);

        Document myDoc = collection.find().first();
        if (myDoc != null) {
            System.out.println(myDoc.toJson());
        }
    }
}