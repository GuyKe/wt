package data;


import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

import javax.persistence.*;


/**
 * Created by guyk on 11/5/14.
 */

@Entity
@Table(name = "image")
public class Image {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column
    private final String url;
    @Column
    private final String idToHashTag;
    @Column
    private final String user;
    @Column
    private final LocalDateTime timeOfCapture;

    public Image(final String url,final String idToHashTag, final String user,final LocalDateTime timeOfCapture) {

        this.url = url;
        this.user = user;
        this.idToHashTag = idToHashTag;
        this.timeOfCapture = timeOfCapture;
    }


    public int getId() {
        return id;
    }

    public LocalDateTime getTimeOfCapture() {
        return timeOfCapture;
    }

    public String getUrl() {
        return url;
    }

    public String getIdToHashTag() {
        return idToHashTag;
    }

    public String getUser() {
        return user;
    }


}
