/**
 * League.java
 * 
 * Created on May 4, 2016, 7:34:49 PM
 *
 */
package lol.challenge.stratejinxlolcation;

import java.util.List;

/**
 * {Insert class description here}
 *
 * @author Carlos Bernal
 * @since May 4, 2016
 */
public class League {

    private String name;
    private String tier;
    private String queue;
    private List<PlayerShort> entries;

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "{\"League\" :{\"name\":\"" + name + "\", \"tier\":\"" + tier + "\", \"queue\":\"" + queue
                + "\", \"entries\":\"" + entries + "\"}}";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the tier
     */
    public String getTier() {
        return tier;
    }

    /**
     * @param tier
     *            the tier to set
     */
    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * @return the queue
     */
    public String getQueue() {
        return queue;
    }

    /**
     * @param queue
     *            the queue to set
     */
    public void setQueue(String queue) {
        this.queue = queue;
    }

    /**
     * @return the entries
     */
    public List<PlayerShort> getEntries() {
        return entries;
    }

    /**
     * @param entries
     *            the entries to set
     */
    public void setEntries(List<PlayerShort> entries) {
        this.entries = entries;
    }

}
