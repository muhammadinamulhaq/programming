export const UserGreeting = (props) => {
  const isLoggedIn = true
  return <div>Welcome {isLoggedIn ? `${props.name}` : 'Guest'}</div>
}
