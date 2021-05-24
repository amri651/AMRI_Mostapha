<%@ page import="entité.*,DAO.*,servlet.*,java.util.*" import="javax.servlet.httpServlet" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
      <a class="navbar-brand" href="Acceuil.jsp">Acceuil</a>
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="S_authentifier.jsp">S'authentifier</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="S_inscrire.jsp">S'inscrire</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" href="AjouterLivre" tabindex="-1" aria-disabled="true">Ajouter un livre</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" href="Lister_ReserverLivre" tabindex="-1" aria-disabled="true">Lister les livres d'une catégorie / Réserver un livre</a>
        </li>
      </ul>

    </div>
  </div>
</nav>