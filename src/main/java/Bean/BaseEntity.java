package Bean;

import java.io.Serializable;

public interface BaseEntity extends Serializable {
    /**
     * @param entity
     */
    void update(BaseEntity entity);

    /**
     * @return unique identifier
     */
    Object getFindById();
}
