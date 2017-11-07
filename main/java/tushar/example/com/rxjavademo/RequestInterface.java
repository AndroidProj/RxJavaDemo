package tushar.example.com.rxjavademo;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Sonal on 12-07-2017.
 */
public interface RequestInterface {
    @GET("android/jsonarray/")
    Observable<List<Android>> register();
}
