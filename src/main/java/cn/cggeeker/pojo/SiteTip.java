package cn.cggeeker.pojo;

import lombok.Data;
import lombok.Generated;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Auther:CG
 * @Date:2019/6/14/014
 * @Description:cn.cggeeker.pojo
 * @version:1.0
 */
@Data
@Table(name = "sitetip_tb")
public class SiteTip {
    @Id
    @KeySql(useGeneratedKeys = true)
    private int sitetipId;

    private String sitetipName;

    private String sitetipContent;
}
