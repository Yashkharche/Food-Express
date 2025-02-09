import { api } from "../../../config/api";
import { createOrderFailure, createOrderRequest, createOrderSuccess, getUsersOrdersFailure, getUsersOrdersRequest, getUsersOrdersSuccess } from "./ActionCreators";
import { GET_USERS_NOTIFICATION_FAILURE, GET_USERS_NOTIFICATION_SUCCESS } from "./ActionTypes";

// createOrder action with improved error handling
// export const createOrder = (reqData) => {
 
//   return async (dispatch) => {
//     dispatch(createOrderRequest());
//     try {
//       const { data } = await api.post('/api/order', reqData.order, {
//         headers: {
//           // Authorization: `Bearer ${reqData.token}`,
//           Authorization: reqData.token,
        
//         },
//       });
//       if (data.payment_url) {
//         window.location.href = data.payment_url;
//       }
//       console.log("Created order data", data);
//       dispatch(createOrderSuccess(data));
//     } catch (error) {
      
//       console.error("Error in creating order:", error.message);
//       if (error.response) {
//         console.error("Error response data:", error.response.data);
//         console.error("Error status:", error.response.status);
//       }
//       dispatch(createOrderFailure(error));
//     }
//   };
// };


export const createOrder = (reqData) => {
  console.log("Request Data:", reqData);  // Debugging request data
  console.log("JWT Token:", reqData.jwt || reqData.token);  // Debugging JWT token

  return async (dispatch) => {
    dispatch(createOrderRequest());

    // if (!reqData.jwt  || !reqData.token) {
    //   console.error("JWT Token is missing!");
    //   dispatch(createOrderFailure("JWT Token is missing"));
    //   return;
    // }

    try {
      const authHeader = `Bearer ${reqData.jwt  || reqData.token}`;
      
      const { data } = await api.post('/api/order', reqData.order, {
        headers: { Authorization: authHeader },
      });

      if (data.payment_url) {
        window.location.href = data.payment_url;
      }

      console.log("Created order data", data);
      dispatch(createOrderSuccess(data));

    } catch (error) {
      console.error("Error in creating order:", error.message);
      if (error.response) {
        console.error("Error response data:", error.response.data);
        console.error("Error status:", error.response.status);
      }
      dispatch(createOrderFailure(error));
    }
  };
};


// getUsersOrders action
export const getUsersOrders = (jwt) => {
  return async (dispatch) => {
    dispatch(getUsersOrdersRequest());
    try {
      const { data } = await api.get(`/api/order/user`, {
        headers: {
          Authorization: `Bearer ${jwt}`,
        },
      });
      console.log("User orders:", data);
      dispatch(getUsersOrdersSuccess(data));
    } catch (error) {
      dispatch(getUsersOrdersFailure(error));
    }
  };
};

// getUsersNotificationAction action
export const getUsersNotificationAction = () => {
  return async (dispatch) => {
    dispatch(createOrderRequest());
    try {
      const { data } = await api.get('/api/notifications');
      console.log("All notifications:", data);
      dispatch({ type: GET_USERS_NOTIFICATION_SUCCESS, payload: data });
    } catch (error) {
      console.error("Error fetching notifications:", error);
      dispatch({ type: GET_USERS_NOTIFICATION_FAILURE, payload: error });
    }
  };
};
