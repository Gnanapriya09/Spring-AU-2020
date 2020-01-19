package Parsing;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Customer {

	public static void main(String[] args) {

		try {
			File inputFile = new File("customer.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("T");
			System.out.println("----------------------------");

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("Customer Key : " + eElement.getElementsByTagName("C_CUSTKEY").item(0).getTextContent());
					System.out.println("Customer Name : " + eElement.getElementsByTagName("C_NAME").item(0).getTextContent());
					System.out.println("Customer Address : "+ eElement.getElementsByTagName("C_ADDRESS").item(0).getTextContent());
					System.out.println("Customer Nation key: "+ eElement.getElementsByTagName("C_NATIONKEY").item(0).getTextContent());
					System.out.println("Customer Phone : " + eElement.getElementsByTagName("C_PHONE").item(0).getTextContent());
					System.out.println("Customer account Balance : "+ eElement.getElementsByTagName("C_ACCTBAL").item(0).getTextContent());
					System.out.println("Customer Domain : "+ eElement.getElementsByTagName("C_MKTSEGMENT").item(0).getTextContent());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}