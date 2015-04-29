package ru.avsidorov.restapitemplate.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
* Created by Alexandr Sidorov on 29.04.2015.
*/
public class Counts implements Serializable {

    @SerializedName("this")
    @Expose
    private Integer _this;
    @Expose
    private Integer total;

    /**
     * @return The _this
     */
    public Integer getThis() {
        return _this;
    }

    /**
     * @param _this The this
     */
    public void setThis(Integer _this) {
        this._this = _this;
    }

    /**
     * @return The total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * @param total The total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

}
