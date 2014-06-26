package interfaces.entities;

import org.jdom2.Element;


/**
 * Interface for xml serializable classes
 */
public interface Serializable {
		/**
		 * Serialize entity in XML node
		 * @return Element
		 */
		Element toXML();
		
		/**
		 * Build an entity from XML node
		 */
		void buildFromXML();
}
