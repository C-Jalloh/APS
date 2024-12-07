<script setup lang="ts">
const data = () => fetch("http://localhost:8080/api/movies")
	.then(response => response.json())
	.then(movies => {
		const movieList = document.getElementById("movieList");
		movies.array.forEach((movie: { id: bigint; title: string; movieDescription: string; quality: string; genre: string; duration: string; releaseDate: string; poster: string; avrRating: bigint; userIds: string; viewCount: bigint; }) => {
			const li = document.createElement("li");
			li.textContent =
				`ID = ${movie.id},
						Title= ${movie.title},
						Description= ${movie.movieDescription},
						Quality = ${movie.quality},
						Genre = ${movie.genre},
						Duration = ${movie.duration},
						Release Date = ${movie.releaseDate},
						Poster = ${movie.poster},
						Average Rating = ${movie.avrRating},
						User Ids = ${movie.userIds},
						View Count = ${movie.viewCount}`;
			movieList?.appendChild(li);

		});

	})
	.catch(error => console.error('Error fetching the data:', error))

</script>

<template>
	<div class="container">
		<h1>Users</h1>
		<button type="button" @click="data()"> Movies </button>
		<ul id="movieList"></ul>
	</div>
	<div>
		<ul id="movieList"></ul>

	</div>

	<header>

	</header>

</template>

<style scoped>
.container {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;

}

button {
	font-weight: bold;
	margin: 10px;
}
</style>
