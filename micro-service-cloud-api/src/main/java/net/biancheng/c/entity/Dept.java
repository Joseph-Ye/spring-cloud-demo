package net.biancheng.c.entity;

/**
 * @author jhye4@ilfytek.com
 * @date 2023/3/16 14:43
 */
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.io.Serializable;
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private Integer deptNo;
    private String deptName;
    private String dbSource;
}
