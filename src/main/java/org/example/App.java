package org.example;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class App {
    public static void main(String[] args) {
        // Connect to MongoDB on port 27017
        MongoClient mongoClient = new MongoClient("mongo-dbserver", 27017);

        // Get database and collection
        MongoDatabase database = mongoClient.getDatabase("mydb");
        MongoCollection<Document> collection = database.getCollection("mycol");

        // Insert a document
        Document doc = new Document("name", "DevOps Project");
        collection.insertOne(doc);

        System.out.println("Connected to MongoDB and inserted document!");
        mongoClient.close();
    }
}