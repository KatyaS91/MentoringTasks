package tasks.part2_4.daoxml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import tasks.part2_4.bean.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * Created by Katsiaryna_Skarzhyns on 9/21/2017.
 */
public class BouquetXmlDAOImpl implements BouquetXmlDAO {

	public int createBouquet(BaseBouquet bouquet) throws DAOException{
		BaseFlower flower = null;
		String flowerName = bouquet.getFlowerName();
		int count = bouquet.getAmount();
		int price;

		switch (flowerName){
		case "Chamomile":
			flower = new Chamomile(count);
			break;
		case "Cornflower":
			flower = new Cornflower(count);
			break;
		case "Myosotis":
			flower = new Myosotis(count);
			break;
		default:
			throw new DAOException();
		}
		price = flower.getPrice() * count;
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setNamespaceAware(true);
			Document doc = factory.newDocumentBuilder().newDocument();

			Element root = doc.createElement("bouquet");
			root.setAttribute("xmlns", "http://www.javacore.ru/schemas/");
			doc.appendChild(root);

			Element item1 = doc.createElement("flowername");
			item1.setAttribute("val", flowerName);
			root.appendChild(item1);

			Element item2 = doc.createElement("amount");
			item2.setAttribute("val", String.valueOf(count));
			root.appendChild(item2);

			Element item3 = doc.createElement("prise");
			item3.setAttribute("val", String.valueOf(price));
			root.appendChild(item3);

			File file = new File("C:\\bouquet.xml");
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(new DOMSource(doc), new StreamResult(file));
		} catch (ParserConfigurationException ex) {
			throw new DAOException();
		} catch (TransformerConfigurationException e) {
			throw new DAOException();
		} catch (TransformerException e) {
			throw new DAOException();
		}
		return price;
	}
}