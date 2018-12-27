import React from 'react'
import { renderToString } from 'react-dom/server'
import { StaticRouter } from 'react-router-dom'
import Routes from '../client/Routes'

window.render = (template, model) => {
  const html = renderToString(
    <StaticRouter location={model.location} context={{}}>
      <Routes/>
    </StaticRouter>
  )
  return template.replace('${HTML_CONTENT}', html)
}