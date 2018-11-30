package de.pinkpanther.papf.generic.backend;

import java.io.Serializable;

public abstract class PAPFEntity<E extends PAPFEntity<E>> implements Serializable {
    private static final long serialVersionUID = 753220035928243412L;
}
