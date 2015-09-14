package net.petrabarus.yii2.thrift.test;

import net.petrabarus.services.HelloLanguage;
import net.petrabarus.services.HelloService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TTransport;

public class Client {

    public static void main(String[] args) {

        try (TTransport transport = new THttpClient("http://localhost:80")) {
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            HelloService.Client client = new HelloService.Client(protocol);
            System.out.println(client.say_hello());
            System.out.println(client.say_hello_repeat(10));
            System.out.println(client.say_foreign_hello(HelloLanguage.SPANISH));
        } catch (TException x) {
            x.printStackTrace();
        }
    }
}
