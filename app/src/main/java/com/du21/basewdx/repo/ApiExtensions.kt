import com.du21.basewdx.repo.Resource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.HttpException

fun <T> callApi(
    dispatcher: CoroutineDispatcher = Dispatchers.IO,
    callApi: suspend () -> T?
) = flow {
    emit(Resource.loading())
    emit(Resource.success(callApi.invoke()))
}.flowOn(dispatcher).catch { e ->
    when (e) {
        is HttpException -> {
            //todo handle http error response
        }
        else -> {
            //todo handle other error
        }
    }
}