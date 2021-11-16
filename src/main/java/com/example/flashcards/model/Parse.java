package com.example.flashcards.model;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;

public class Parse {

    public void StartParsing(String name, Root root) {

        Document doc;
        try {
            doc = buildDocument(name);
        } catch (Exception e) {
            System.out.println("Open parsing error");
            return;
        }

        Node rootNode = doc.getFirstChild();

        NodeList rootChilds = rootNode.getChildNodes();

        Node questionsNode = null;

        for (int i = 0; i < rootChilds.getLength(); i++) {

            if (rootChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }

            questionsNode = rootChilds.item(i);
            System.out.println("AAA " + questionsNode.getNodeName());

        }

        if (questionsNode == null) {
            return;
        }


        List<Questions> questionsList = new ArrayList<>();
        NodeList questionsChilds = questionsNode.getChildNodes();

        for (int i = 0; i < questionsChilds.getLength(); i++) {

            if (questionsChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }

            if (!questionsChilds.item(i).getNodeName().equals("element")){
                continue;
            }

            String question = "";
            String answer = "";

            NodeList elementsChilds = questionsChilds.item(i).getChildNodes();
            for (int j = 0; j < elementsChilds.getLength(); j++) {

                if (elementsChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }

                switch(elementsChilds.item(j).getNodeName()){

                    case "question": {
                        question = elementsChilds.item(j).getTextContent();
                        break;
                    }
                    case "answer": {
                        answer = elementsChilds.item(j).getTextContent();
                        break;
                    }

                }

            }

            Questions questions = new Questions(question, answer);
            questionsList.add(questions);
        }

        root.setQuestions(questionsList);
    }

    private static Document buildDocument(String name) throws Exception{
        File file = new File(name);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        return dbf.newDocumentBuilder().parse(file);
    }

}
