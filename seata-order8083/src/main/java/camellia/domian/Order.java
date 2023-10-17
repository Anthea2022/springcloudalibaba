package camellia.domian;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author anthea
 * @date 2023/10/16 16:10
 */
@Data
@NoArgsConstructor
public class Order {
    private Integer id;

    private Integer uid;

    private Integer pid;

    private Integer count;

    private Integer money;

    private Integer status;
}
