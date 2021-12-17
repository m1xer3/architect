package ru.danilsibgatullin.implementations;

import org.apache.commons.lang3.StringUtils;
import ru.danilsibgatullin.models.HttpHeader;
import ru.danilsibgatullin.models.HttpRequest;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class RequestParser {

        public HttpRequest parseRequest(Deque<String> rawRequest) {
            String[] firstLine = rawRequest.pollFirst().split(" ");
            String method = firstLine[0];
            String url = firstLine[1];

            Map<String, String> headers = new HashMap<>();
            while (!rawRequest.isEmpty()) {
                String line = rawRequest.pollFirst();
                if (StringUtils.isBlank(line)) {
                    break;
                }
                String[] header = line.split(": ");
                headers.put(header[0], header[1]);
            }
            StringBuilder body = new StringBuilder();
            while (!rawRequest.isEmpty()) {
                body.append(rawRequest.pollFirst());
            }
            return HttpRequest.getBuilder()
                    .withUrl(url)
                    .withMethod(method)
                    .withBody(body.toString())
                    .withHeaders(HttpHeader.getBuilder()
                                  .withContentType(headers.get("Content-Type"))
                                  .build())
                    .build();
        }

}
