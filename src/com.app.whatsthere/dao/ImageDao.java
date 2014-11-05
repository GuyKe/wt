package dao;

import data.Image;

/**
 * Created by guyk on 11/5/14.
 */
public interface ImageDao {

    void store(String imageId, Image image);

    void fetch(String imageId);
}
