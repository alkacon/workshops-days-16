
package opencms.days;

import org.opencms.file.CmsFile;
import org.opencms.file.CmsObject;
import org.opencms.main.CmsException;
import org.opencms.xml.content.CmsDefaultXmlContentHandler;
import org.opencms.xml.content.CmsXmlContent;

@SuppressWarnings("javadoc")
public class CmsPersonContentHandler extends CmsDefaultXmlContentHandler {

    /**
     * @see org.opencms.xml.content.CmsDefaultXmlContentHandler#prepareForWrite(org.opencms.file.CmsObject, org.opencms.xml.content.CmsXmlContent, org.opencms.file.CmsFile)
     */
    @Override
    public CmsFile prepareForWrite(CmsObject cms, CmsXmlContent content, CmsFile file) throws CmsException {

        super.prepareForWrite(cms, content, file);

        return file;
    }

}
