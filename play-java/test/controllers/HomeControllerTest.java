package controllers;

import domain.User;
import io.ebean.Ebean;
import io.ebean.Finder;
import org.junit.Test;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.GET;
import static play.test.Helpers.POST;
import static play.test.Helpers.route;

public class HomeControllerTest extends WithApplication {

    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    @Test
    public void should_get_index_page() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }

    @Test
    public void should_get_rest_sample() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/rest-sample");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }

    @Test
    public void should_create_user() {
        Ebean.getDefaultServer().createSqlUpdate("delete from mc_user").execute();
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(POST)
                .uri("/users");

        Result result = route(app, request);
        assertEquals(OK, result.status());
        List<User> users = new Finder<>(User.class).all();
        assertThat(users.size(), is(1));
        assertThat(users.get(0).id, is(1l));
        assertThat(users.get(0).name, is("panxin"));
    }
}
