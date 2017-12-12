# VolleyWork
<h4>What is volley</h4>
Volley is an HTTP library developed by Google to ease networking tasks in Android Applications. Volley supersedes Java’s java.net.HttpURLConnection class and Apache’s org.apache.http.client in handling network requests. Volley can handle almost each and everything you will need to do over the network, it handles HTTP request and also manages the async tasks that you need to use while working with canonical networking classes.
<br><br>
Features of Android Volley Library :-
<ol>
<li>Volley manages network request automatically and without you using any AsyncTask. It offers multiple concurrent network connections, resulting in faster and efficient network operations.</li>
<li>Volley caches all network requests, utilizing the previous results in the case of change in activity configuration. However due to the same reason, it is only good for small Volley and not suitable for large download or streaming operations.</li>
<li>It has a powerful cancellation API. You can fully control the request cancellation , or you can set blocks or scopes of requests to cancel.</li>
<li>Volley allows you to control and order the network requests making it easy to populate UI elements in an orderly manner , useful in case of social networking apps like facebook , twitter. It also provides support for request prioritization.</li>
<li>Volley has built in debugging and tracing tools which allow user to get to the root of the error.</li>
</ol>
<h4>Working of Volley</h4>

While using volley you are only concerned about adding a request to the queue, handling it’s response, and you can actually ignore everything that is running in the background. When you fire a network request it is added to cache queue in the priority order. A cache dispatcher thread figures out whether it can service the request entirely from the cache or it needs to fire a network request for the response. In the case of a cache miss or if cached response has expired, the network dispatcher services the request, handles the parsing of the response and returns the response back to the main thread.<br><br>
Volley is very useful for network request involving strings, images, and JSON. It has built in support for these objects.
