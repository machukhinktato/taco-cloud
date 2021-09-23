package tacos.data;

import org.springframework.stereotype.Repository;
import tacos.TacoOrder;

@Repository
public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
