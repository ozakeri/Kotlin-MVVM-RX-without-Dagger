package gap.com.daggermvvm.api

class ApiHelper(val iServices: IServices) {
    fun getUsers() = iServices.getUsers()
}