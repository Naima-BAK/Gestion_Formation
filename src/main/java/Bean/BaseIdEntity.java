package Bean;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import service.ApplicationException;
import service.ErrorCode;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.UUID;

public class BaseIdEntity implements BaseEntity{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;


    public String generateId() {
        return UUID.randomUUID().toString();
    }

    private void init() {
        this.id = this.generateId();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * default constructor generation uuid
     */
    public BaseIdEntity() {
        super();
        this.init();
    }


    @Override
    public void update(BaseEntity entity) {
        throw new ApplicationException(ErrorCode.ERR_SYS_INVALID_INVOCATION);

    }

    @Override
    public Object getFindById() {
        return this.getId();
    }
}
