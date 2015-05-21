package net.mooko.moosm.auth.persistence.shared

import net.mooko.moosm.auth.entity.User
import org.springframework.stereotype.Repository

/**
 * Created by puras on 15/5/21.
 */
@Repository
interface UserMapper {
    public int insert(User user)
}