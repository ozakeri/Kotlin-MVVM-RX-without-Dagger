package gap.com.daggermvvm.api

import gap.com.daggermvvm.model.User
import io.reactivex.Single

interface IServices {
    fun getUsers(): Single<List<User>>
}