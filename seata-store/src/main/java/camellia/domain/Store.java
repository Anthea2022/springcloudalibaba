package camellia.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author anthea
 * @date 2023/10/16 21:26
 */
@Data
@NoArgsConstructor
public class Store {
    private Integer id;

    private Integer pid;

    private Integer total;

    private Integer residue;

    private Integer used;
}
