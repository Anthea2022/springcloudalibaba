package camellia.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author anthea
 * @date 2023/10/16 17:38
 */
@Configuration
@MapperScan("{camellia.dao}")
public class MybatisConfig {
}
