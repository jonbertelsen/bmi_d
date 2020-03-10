<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../includes/header.inc"%>

<h1 class="text-center">BMI beregner</h1>

<div class="row mt-4">

    <div class="col-lg-3"></div>

    <div class="col-lg-6">
        <table class="table table-striped">
            <tr><td>Din højde er:</td><td>${requestScope.height} cm</td></tr>
            <tr><td>Din vægt er:</td><td>${requestScope.weight} kg</td></tr>
            <tr><td>Dit BMI er beregnet til at være: </td><td>${requestScope.bmi}</td></tr>
            <tr><td>Du hører til kategorien:</td><td>${requestScope.kategori}</td></tr>
        </table>

        <div class="text-center"><a  href="index.html">Gå til forsiden</a></div>
    </div>

    <div class="col-lg-3"></div>

</div>  <!-- row -->

<%@include file="../includes/footer.inc"%>