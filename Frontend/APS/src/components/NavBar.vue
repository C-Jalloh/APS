<script setup lang="ts">

</script>

<template>
  <body>
    <div class="container">
        <div class="container1">
            <div class="sidebar">
                <button class="sidebar-btn" type="button"> sidebar</button>
            </div>
            <div class="title">
                <h1>Universal Rating</h1>
            </div>
            <div class="search">
                <form action="" method="get">
                    <textarea  name="search" id="search" cols="50" placeholder="Search here"> </textarea>
                </form>
            </div>
            <div class="socialmedia">
                <div class="app">whatsapp</div>
                <div class="app">instagram</div>
                <div class="app">twitter</div>
            </div>
            <div class="profile">
                <img class="profile-pic" src="../assets/cjalloh.jpeg" alt="a profile picture">
            </div>
        </div>
    </div>
</body>
</template>


<style  scoped>
    body {

background-color: bisque;
border: 3px solid black;
height: 100%;
width: 100%;
margin: 0%;
padding: 0%;
}
h1{
margin-left: 20px;
font-size: 50px;
}

.container {
border: 1px solid black;
width: 100%;
height: 15vh;
background-color: aliceblue;
display: flex;
flex-direction: row;
/* justify-content: center; */
align-items: center;
}


.container1 {
border: 0.5px solid black;
width: 100%;
height: 10vh;
background-color: aqua;
display: flex;
flex-direction: row;
justify-content: center;
align-items: center;
}

.sidebar {
border: 0.25px solid black;
height: 100%;
width: 7vw;
background-color: gray;
display: flex;
flex-direction: row;
justify-content: center;
align-items: center;


}
.sidebar-btn{
width: 4vw;
height: 8vh;
}

.title {
border: 2px solid black;
border: 0.25px solid black;
height: 100%;
width: 40vw;
background-color: gray;
display: flex;
flex-direction: row;
/* justify-content: center; */
align-items: center;

}

.search {
border: 2px solid black;
border: 0.25px solid black;
height: 100%;
width: 25vw;
background-color: gray;
display: flex;
flex-direction: row;
justify-content: center;
align-items: center;


}

.socialmedia {
border: 2px solid black;
border: 0.25px solid black;
height: 100%;
width: 20vw;
display: flex;
flex-direction: row;
/* justify-content: center; */
align-items: center;
background-color: gray;



}
.app{
margin: 10px;
}

.profile {
border: 2px solid black;
border: 0.25px solid black;
height: 100%;
width: 8vw;
background-color: gray;
display: flex;
flex-direction: row;
justify-content: center;
align-items: center;


}

.profile-pic{
border-radius: 50%;
height: 7vh;
width: 4vw;
}

</style>
