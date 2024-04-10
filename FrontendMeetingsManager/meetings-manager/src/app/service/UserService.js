import axios from 'axios';

const USER_API_BASE_URL = "http://localhost:8080/api/meeting/";

 class UserService{
    getAllUsers(){
        return axios.get(USER_API_BASE_URL + "users");
    }

    createUser(User){
        return axios.post(USER_API_BASE_URL + "users", User);
    }

    getUSERById(UserId){
        return axios.get(USER_API_BASE_URL + "users/" + UserId);
    }

    /* updateUSER(USER, USERId){
        return axios.put(USER_API_BASE_URL + "users/" + USERId, USER);
    } */

    deleteUSER(UserId){
        return axios.delete(USER_API_BASE_URL + "users/" + UserId);
    }
}

export default new UserService()