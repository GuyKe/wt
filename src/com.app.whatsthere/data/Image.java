package data;


import org.joda.time.DateTime;

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
    private final DateTime timeOfCapture;

    public Image(final String url,final String idToHashTag, final String user) {

        this.timeOfCapture = new DateTime();
        this.url = url;
        this.user = user;
        this.idToHashTag = idToHashTag;
    }


    public int getId() {
        return id;
    }

    public DateTime getTimeOfCapture() {
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
