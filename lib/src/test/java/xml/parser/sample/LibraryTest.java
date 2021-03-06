/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package xml.parser.sample;

import org.junit.jupiter.api.Test;

import com.xml.parser.sample.Library;
import com.xml.parser.sample.pojo.ServiceBuilder;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import javax.xml.bind.JAXBException;


class LibraryTest
{

    @Test
    void someLibraryMethodReturnsTrue()
    {
        Library app = new Library();
        ServiceBuilder service = null;
        // Rooting
        try
        {
            // Reading from XML
            service = app.unmarshall("service.xml");
            System.out.println("service :" + service);
        }
        catch (JAXBException | IOException e)
        {
            System.err.println(e);
            e.printStackTrace();
        }
        // Writing
        try
        {
            // Writing to XML
            app.marshal(service, "generated.xml");
        }
        catch (JAXBException | IOException e)
        {
            e.printStackTrace();
        }
    }
}
