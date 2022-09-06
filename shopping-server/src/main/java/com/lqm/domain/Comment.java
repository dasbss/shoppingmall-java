package com.lqm.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName comment
 */
@TableName(value ="comment")
@Data
public class Comment implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer cid;

    /**
     * 
     */
    private String cusername;

    /**
     * 
     */
    private String cinfo;

    /**
     * 
     */
    private String ctime;

    /**
     * 
     */
    private Integer cgood;

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
        Comment other = (Comment) that;
        return (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getCusername() == null ? other.getCusername() == null : this.getCusername().equals(other.getCusername()))
            && (this.getCinfo() == null ? other.getCinfo() == null : this.getCinfo().equals(other.getCinfo()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getCgood() == null ? other.getCgood() == null : this.getCgood().equals(other.getCgood()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getCusername() == null) ? 0 : getCusername().hashCode());
        result = prime * result + ((getCinfo() == null) ? 0 : getCinfo().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getCgood() == null) ? 0 : getCgood().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cid=").append(cid);
        sb.append(", cusername=").append(cusername);
        sb.append(", cinfo=").append(cinfo);
        sb.append(", ctime=").append(ctime);
        sb.append(", cgood=").append(cgood);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}