package br.com.alura.screenmatch.principal;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.screenmatch.exceptions.ErroConversaoAno;
import br.com.alura.screenmatch.models.Titulo;
import br.com.alura.screenmatch.models.TituloOmdb;

public class PrincipalComBusca {
  public static void main(String[] args) throws IOException, InterruptedException {

    try {
      Scanner scanner = new Scanner(System.in);
      String titulo = "";
      List<Titulo> titulos = new ArrayList<>();
      Gson gson = new GsonBuilder()
          .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
          .setPrettyPrinting()
          .create();

      while (!titulo.equalsIgnoreCase("sair")) {
        System.out.println("Digite o nome do titulo desejado ou sair:");
        titulo = scanner.nextLine();
        if (titulo.equalsIgnoreCase("sair")) {
          break;
        }
        String api = "http://www.omdbapi.com/?t=" + titulo.replace(" ", "+") + "&apikey=5c247024";
        System.out.println(api);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(api))
            .build();

        HttpResponse<String> response = client
            .send(request, BodyHandlers.ofString());

        String json = response.body();

        TituloOmdb novoTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        Titulo novoTitulo = new Titulo(novoTituloOmdb);
        novoTitulo.exibeFichaTecnica();
        titulos.add(novoTitulo);

      }
      FileWriter writer = new FileWriter("titulos.json");
      writer.write(gson.toJson(titulos));
      writer.close();
      scanner.close();
      System.out.println("Aplicação finalizada corretamente");
    } catch (ErroConversaoAno e) {
      System.out.println(e.getMessage());
    }

  }
}
