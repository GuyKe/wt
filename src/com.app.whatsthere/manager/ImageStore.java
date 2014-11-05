package manager;

import dao.ImageDao;
import dao.ImageDaoImpl;
import data.Image;
import exception.ImageToOldException;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import utils.DateTimeUtils;

/**
 * Created by guyk on 11/5/14.
 */
public class ImageStore {

    private final ImageDao dao = new ImageDaoImpl();
    private final DateTimeUtils dateTimeUtils = new DateTimeUtils();

    public void storeImage(final String url,final String idToHashTag, final String user,
                           final LocalDateTime dateTime) throws ImageToOldException {
        int imageId = 0;
        if (!dateTimeUtils.ValidateDateTime(dateTime)) throw new ImageToOldException(imageId);
        dao.store(url,idToHashTag,user, LocalDateTime.now());


    }

    public Image fetchImage(int id) {
        return null;
    }






}
