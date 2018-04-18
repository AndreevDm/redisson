package org.redisson.transaction;

import org.redisson.client.codec.Codec;

/**
 * 
 * @author Nikita Koksharov
 *
 */
public class HashKey {

    final Codec codec;
    final String name;
    
    public HashKey(String name, Codec codec) {
        this.name = name;
        this.codec = codec;
    }
    
    public Codec getCodec() {
        return codec;
    }
    
    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HashKey other = (HashKey) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    
}