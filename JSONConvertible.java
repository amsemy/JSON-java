package org.json;
/**
 * The <code>JSONConvertible</code> interface allows a <code>toJSONObject()</code>
 * method so that a class can change the behavior of
 * <code>JSONObject.put()</code> and <code>JSONArray.put()</code>. The
 * <code>toJSONObject</code> method will be used when a class will be put in the
 * JSONObject or JSONArray and quoting the result.
 */
public interface JSONConvertible {
    /**
     * The <code>toJSONObject</code> method allows a class to produce its own
     * JSON serialization.
     *
     * @return A JSONObject.
     */
    public JSONObject toJSONObject();
}
