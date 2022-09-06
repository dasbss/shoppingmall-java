package com.lqm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName shoppingcart
 */
@TableName(value ="shoppingcart")
@Data
public class Shoppingcart implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer sid;

    /**
     * 
     */
    private String spicture;

    /**
     * 
     */
    private String sinfo;

    /**
     * 
     */
    private Integer sprice;

    private Integer snum;
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Shoppingcart other = (Shoppingcart) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getSpicture() == null ? other.getSpicture() == null : this.getSpicture().equals(other.getSpicture()))
            && (this.getSinfo() == null ? other.getSinfo() == null : this.getSinfo().equals(other.getSinfo()))
            && (this.getSprice() == null ? other.getSprice() == null : this.getSprice().equals(other.getSprice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getSpicture() == null) ? 0 : getSpicture().hashCode());
        result = prime * result + ((getSinfo() == null) ? 0 : getSinfo().hashCode());
        result = prime * result + ((getSprice() == null) ? 0 : getSprice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", spicture=").append(spicture);
        sb.append(", sinfo=").append(sinfo);
        sb.append(", sprice=").append(sprice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}