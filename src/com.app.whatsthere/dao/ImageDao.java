package dao;

import data.Image;
import org.joda.time.LocalDateTime;

/**
 * Created by guyk on 11/5/14.
 */
public interface ImageDao {

    void store(final String url,final String idToHashTag, final String user, LocalDateTime dateTime);

    void fetch(String imageId);
}
