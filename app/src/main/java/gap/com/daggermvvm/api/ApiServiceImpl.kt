package gap.com.daggermvvm.api

import com.rx2androidnetworking.Rx2AndroidNetworking
import gap.com.daggermvvm.model.User
import io.reactivex.Single

class ApiServiceImpl : IServices {
    override fun getUsers(): Single<List<User>> {
        return Rx2AndroidNetworking.get("https://5e510330f2c0d300147c034c.mockapi.io/users")
            .build()
            .getObjectListSingle(User::class.java)
    }
}