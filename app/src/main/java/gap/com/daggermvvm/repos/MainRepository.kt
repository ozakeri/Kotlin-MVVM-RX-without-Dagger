package gap.com.daggermvvm.repos

import gap.com.daggermvvm.api.ApiHelper
import gap.com.daggermvvm.model.User
import io.reactivex.Single

class MainRepository(val apiHelper: ApiHelper) {
    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}